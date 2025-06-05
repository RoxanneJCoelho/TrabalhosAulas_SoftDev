function botoes() {
    const ole = document.querySelector('#container')
    for (i = 1; i <= 100; i++) {
        const botao = document.createElement('button')
        botao.innerText = "bom dia"
        botao.classList.add('classListTest')
        ole.appendChild(botao)
    }
}
botoes()