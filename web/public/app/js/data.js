async function getData() {
  await fetch('https://www.datos.gov.co/resource/p95u-vi7k.json?$limit=5000&$offset=0&$order=departamento')
          .then(response => response.json())
          .then(data => {
            let departamentos = [];
            let municipios = [];
            let codeDepartamentos = [];
            const state = document.querySelector('#departamento');
            const city = document.querySelector('#ciudades');
            data.map(municipality => {
              municipios.push(municipality);
              if (!codeDepartamentos.includes(municipality.c_digo_dane_del_departamento)) {
                codeDepartamentos.push(municipality.c_digo_dane_del_departamento);
                let option = document.createElement('option');
                option.setAttribute('value', municipality.departamento);
                option.textContent = municipality.departamento;
                state.appendChild(option);
              }
            });
            let reset = 0;
            state.addEventListener('change', function (e) {
              let index = this.options[state.selectedIndex].getAttribute('value');
              const cityFilter = municipios.filter(city => {
                return city.departamento === index;
              });
              if (reset === 1) {
                const optionsToRemove = document.querySelectorAll('#city');
                if (optionsToRemove.length > 0)
                  optionsToRemove.forEach(option => city.removeChild(option));
                reset = 0;
              }
              cityFilter.map(cities => {
                const option = document.createElement('option');
                option.setAttribute('value', cities.municipio);
//                alert(cities.municipio);
                option.setAttribute('id', 'city');
                option.textContent = cities.municipio;
                city.appendChild(option);
                if (reset === 0)
                  reset++;
              });
            });
          });
}
getData();