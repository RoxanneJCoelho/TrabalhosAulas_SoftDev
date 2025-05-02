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

let dia = prompt("Que dia de semana é hoje?").toLowerCase().trim()
if (dia == "sexta") {
    alert("yay, sobrevivemos a mais uma semana!")
} else {
    alert("falta quase")
}

let password = prompt("Introduza uma password")
if (password.length<6) {
    alert("password invalida, precisa de ter 6 caracteres")
} else{
    alert("password valida!")
}

let dia_case = prompt("Que dia de semana é hoje?").toLowerCase().trim()
switch (dia_case){
    case "segunda":
        alert("bom começo de semana!")
    case "terça":
        alert("a semana vai correr bem, respira fundo!")
    case "quarta":
        alert("meio da semana, lets go!")
    case "quinta":
        alert("esta quase a acabar!")
    case "sexta":
        alert("bom fim de semana!")
    default:
        alert("dia invalido")
}
