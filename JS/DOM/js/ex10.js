const form = document.querySelector('form')

form.addEventListener('submit', function(e) {
    e.preventDefault()

    const formData = new FormData(this)
    const produtoName = formData.get('text')
    const quantidade = formData.get('quantidade')

    if (produtoName && quantidade !== '') {
        const lista = document.getElementById('lista')
        const item = document.createElement('li')
        item.textContent = `${produtoName} — ${quantidade}`
        lista.appendChild(item)

        this.reset()
        console.log('submetido!')
    }
})
