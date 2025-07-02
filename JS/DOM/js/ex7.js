function inverter() {
    const myLis = document.querySelectorAll("li");

    for (let element of myLis) {
        if (element.classList.contains('highlight')) {
            element.classList.remove('highlight');
        } else {
            element.classList.add('highlight');
        }
    }
}
