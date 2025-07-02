const helloButton = document.getElementById("hello");
const byeButton = document.getElementById("goodbye");

function teste() {
    alert('Ola')
}

helloButton.addEventListener("mouseover", teste);

byeButton.addEventListener("mouseover", function () {
    alert("Adeus");
});


const randomButton = document.getElementById('change-color');
const p = document.getElementById('new-color'); 

// Função auxiliar que gera um número inteiro aleatório entre 0 e max - 1
function randomInt(max) {
  return Math.floor(Math.random() * max);
}

// Função principal que usa randomInt para gerar valores RGB
function gerarCorAleatoria() {
  const r = randomInt(256); // número entre 0 e 255
  const g = randomInt(256);
  const b = randomInt(256);
  return `rgb(${r}, ${g}, ${b})`;
}


function mudarCorDeFundo() {
  const cor = gerarCorAleatoria();
  document.body.style.backgroundColor = cor; 
  p.textContent = `Cor atual: ${cor}`;
}

randomButton.addEventListener('click', mudarCorDeFundo);


