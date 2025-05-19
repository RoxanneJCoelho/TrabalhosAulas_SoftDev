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
// while (item.toLowerCase().trim() !== 'código'){
//     if (item.toLowerCase().trim() == 'apagar'){
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

// let shoppingList = []
// let item = prompt('que elemento queres comprar?')
// while (item.toLowerCase().trim() !== 'código'){
//     if (item.toLowerCase().trim() == 'apagar'){
//         deletedItem = prompt('que elemento queres apagar?')
//         shoppingList.indexOf(deletedItem)
//     } else {
//         shoppingList.push(item)
//     } 
//     item = prompt('que elemento queres comprar?')    
// }

// for (let element of shoppingList){
//     console.log(element)
// }


// const airplaneSeats = [
// ['Ruth', 'Anthony', 'Stevie'],
// ['Amelia', 'Pedro', 'Maya'],
// ['Xavier', 'Ananya', 'Luis'],
// ['Luke', null, 'Deniz'],
// ['Rin', 'Sakura', 'Francisco']
// ]


// // substituir null pelo meu nome
//  airplaneSeats[3][1]='Roxie'
//  console.log(airplaneSeats)

let product = {
  nome: 'agulha de crochet',
  inStock: true,
  price: 1.99,
  colors: ['vermelho','azul', 'verde']
}

console.log(product.price)
console.log(product.colors[2])

product.price = 2.55
console.log(product.price)
