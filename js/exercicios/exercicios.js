// let myLuckyNumber = 25

// let myName = 'Roxie'

// alert(myName + ' ' + myLuckyNumber)

// const message = "   TASTE THE RAINBOW! "
// const whisper = message.toLowerCase().trim()
// console.log(whisper)

// const word = "skateboard"
// const board = word.slice(5,10)
// console.log(board)
// const facialHair = word.replace("o", "e")
// console.log(facialHair)

// let millionDollarQuestion = prompt('que tal a semana com feriado e apagão?');
// console.log(millionDollarQuestion)

// let primeiroNome = prompt("Qual o teu primeiro nome?")
// console.log(primeiroNome)
// let ultimoNome = prompt("Qual o teu ultimo nome?")
// console.log(ultimoNome)

// alert(`Olá! ${primeiroNome} ${ultimoNome}`)

// o javascript não precisa de ponto e virgula
// let userWeekDay = prompt("Que dia de semana é hoje?").toLowerCase().trim()
// if (userWeekDay == "sexta") {
//     alert("yay, sobrevivemos a mais uma semana!")
// } else {
//     alert("falta quase")
// }

// let password = prompt("Introduza uma password")
// if (password.length<6) {
//     alert("password invalida, precisa de ter 6 caracteres")
// } else{
//     alert("password valida!")
// }

// let dia_case = prompt("Que dia de semana é hoje?").toLowerCase().trim()
// switch (dia_case){
//     case "segunda":
//         alert("bom começo de semana!")
//     case "terça":
//         alert("a semana vai correr bem, respira fundo!")
//     case "quarta":
//         alert("meio da semana, lets go!")
//     case "quinta":
//         alert("esta quase a acabar!")
//     case "sexta":
//         alert("bom fim de semana!")
//     default:
//         alert("dia invalido")
// }

// arrays
// let shoppingList=['batatas']
// let item = prompt('qual o item a adicionar?: ')

// shoppingList.push(item)

// console.log(shoppingList)

// exercicio array planetas
// let SolarSystem = ['Mercúrio', 'Vénus', 'Terra', 'Mart', 'Jupiter', 'Saturno', 'Urano', 'Neptuno', 'Plutão']
// SolarSystem[3] = 'Marte'

// SolarSystem.pop()

// SolarSystem.unshift('Roxie')

// console.log(SolarSystem)

// for (let i=1; i<=6; i++){
//     console.log(i + 'Da ba dee da ba daa')
// }

// for ( let numero = 25; numero >= 5; numero-=5){
//     console.log(numero)
// }

// const people = ['Scooby', 'Velma', 'Daphne', 'Shaggy', 'Fred']
// for(let i=0; i<people.length; i++){
//     console.log(i, people[i].toUpperCase())
// }

// // outra forma de iterar o array
// for(let element of people){ // of da os nomes
//     console.log(element)
// }

// for(let element in people){ // in da o numero das posiçoes dos elementos do array
//     console.log(element)
// }

// este exercicio tem mais alineas
// parte 2: no prompt, caso o user coloque apagar, apaga a ultima coisa que adicionou
// let shoppingList = []
// let item = prompt('que elemento queres comprar?')
// while (item !== 'código'){
//     if (item == 'apagar'){
//         shoppingList.pop()
//     } else {
//         shoppingList.push(item)
//     } 
//     item = prompt('que elemento queres comprar?')    
// }

// for (let element of shoppingList){
//     console.log(element)
// }

// parte 3: No prompt, quando o user coloca apagar abre um prompt para escrever o item a apagar e apaga o mesmo.

let shoppingList = []
let item = prompt('que elemento queres comprar?')
while (item !== 'código'){
    if (item == 'apagar'){
        deletedItem = prompt('que elemento queres apagar?')
        shoppingList.indexOf(deletedItem)
    } else {
        shoppingList.push(item)
    } 
    item = prompt('que elemento queres comprar?')    
}

for (let element of shoppingList){
    console.log(element)
}
