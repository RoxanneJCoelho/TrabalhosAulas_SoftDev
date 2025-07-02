// let myForm = document.querySelector('form');

// myForm.addEventListener('submit', function(e){
//   e.preventDefault()
//   console.log('cucu, faz validações e coisas de ui/ux, nomeadamente bloquear o botão');

//   const animalVal = document.querySelector('#animal').value 
//   const myList = document.querySelector('#zoo-animals');
//   const myLi = document.createElement('li');
//   myLi.textContent = animalVal;
 
 
//   myList.appendChild(myLi)
 
//   myForm.reset();
// })

// funcao que faz a consulta á api, traz o resultado em json e transforma de forma a que o JS consiga interpretar
 
const loadTVShow = async() => {
  const result = await fetch('https://api.tvmaze.com/search/shows?q=friends');
  const data = await result.json();

  return data;
}

// funcao que constroi com o resultado da api (quando ele chegar) o html

const getData = async() => {
  const result = await loadTVShow();

  // console log ou criar elementos, etc
  console.log(result)

}
getData();
