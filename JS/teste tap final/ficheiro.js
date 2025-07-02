// teste pratico de js
// Nome: Roxanne Coelho

// ex1
// o que é o js?
// Javascript é uma linguagem de programação usada em web, considerada o padrão em linguagem "client side" para qualquer browser. É também responsável por dar movimento ao site.

// O JS serve, entre muitas funções, como por exemplo a validação de formulários

// ex2
// Neste caso, o elemento input seria criado em JS. Ao criar o input em JS é possivel colocar-lo de forma a ele só aparecer após o login.

// ex3
// ex3.1
let num1 = '5'
let num2 = '3'
let jsDone = true
console.log(num1+num2)
// num1+num2 = 53, porque '5' e '3' estão como string
// ex 3.2
num2 = 15
console.log(num1+num2)
// num2 altera para 15, como é let é possivel alterar
// ex 3.3, num1 + num2 continua a não ser 20, e sim 515, porque o num1 continua a ser string
// ex 3.4 let num1 = 1
// ex 3.5 boolean

// ex4
// ex 4.1
let passwords = ["sara1232", "1126", "superSafePass"]
let myPass = "sara1234"
passwords.push("UmaPassFixe")
console.log(passwords)

// ex 4.2.
// passwords[5] não retorna nada, porque não existe indice 5 no array passwords

// ex 4.3
function exercicio43(){
    pass = prompt('Digite a sua password')
    if (pass.length >6){
        alert('Password segura')
    } 
}

// ex 5
// ex 5.1
// Seleciona a div com id "portal"
const portal = document.getElementById("portal")

// Cria o novo parágrafo
const aviso = document.createElement("p");
aviso.innerText = "Lembra-te de verificar os avisos importantes todos os dias."

// Adiciona o parágrafo dentro da div
portal.appendChild(aviso)

// ex 5.2
portal.classList.add('new-alert')

// ex 5.3
portal.addEventListener('click', function(){
    let novoAviso = prompt('Novo Aviso')
    if(novoAviso){
        let novoParagrafo = document.createElement('p')
        novoParagrafo.innerText = novoAviso
        portal.appendChild(novoParagrafo)
    }    
})

// ex 6.1
const titulo = document.getElementsByClassName('achievements')[0]
titulo.innerText = "Conquistas da Vida"

// ex 6.2
titulo.style.color = 'red'

// ex 6.3
const lista = document.getElementById('myList')
const itens = lista.querySelectorAll('li')

itens.forEach(item => {
  item.textContent += ' - com sucesso!'
})

// ex 6.4
const form = document.querySelector('form');
const input = document.getElementById('myItem');

form.addEventListener('submit', function(e) {
  e.preventDefault();
  const nomeLista = input.value.trim();

  if (nomeLista !== '') {
    const novoItem = document.createElement('li');
    novoItem.textContent = nomeLista;
    lista.appendChild(novoItem);
    this.reset();
  }
});

// ex 7
document.addEventListener('keydown', function(event){
  if (event.key === 'Escape') {
    alert('Tens a certeza que queres entregar o teste?');
  }
});










