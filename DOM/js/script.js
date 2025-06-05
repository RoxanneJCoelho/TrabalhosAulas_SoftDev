const mySpan = document.getElementById('History')
console.log(mySpan.innerText)
mySpan.innerText = "História"

const myDivs = document.getElementsByTagName('div')
console.log(myDivs)

const myDivsQ = document.querySelectorAll('div')
console.log(myDivsQ)

const body = document.querySelector('body ')

function CreateP(){
    let mynewP = document.createElement('p');
    mynewP.innerText = 'Yay, chegaste ao fim dos patos'
    body.appendChild(mynewP)
}




