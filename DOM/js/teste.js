let myForm = document.querySelector('form');

myForm.addEventListener('submit', function(e){
  e.preventDefault()
  console.log('cucu, faz validações e coisas de ui/ux, nomeadamente bloquear o botão');

  const animalVal = document.querySelector('#animal').value 
  const myList = document.querySelector('#zoo-animals');
  const myLi = document.createElement('li');
  myLi.textContent = animalVal;
 
 
  myList.appendChild(myLi)
 
  myForm.reset();
})
 