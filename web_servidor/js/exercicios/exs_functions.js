// function printHeart() {
//     alert('<3');
// }

// function rant(message) {
//     for (let i = 0; i < 3; i++) {
//         console.log(i+1 +" "+ message.toUpperCase());
//     }
// }

// function hate(){
//     let hateMessage = prompt('o que odeias?')
//     rant(hateMessage)
// }

function isSnakeEyes(num1, num2){
    num1 = prompt('diz o primeiro numero: ')
    num2 = prompt('diz o segundo número: ')
    if (num1 && num2 == 1){
        console.log('yay, snake eyes')
    } else {
        console.log('not snake eyes')
    }

}