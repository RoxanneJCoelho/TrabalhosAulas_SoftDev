const num1 = document.getElementById('num1');
const num2 = document.getElementById('num2');
const operacao = document.getElementById('operacao');
const resultado = document.getElementById('resultado');
const botaoCalcular = document.getElementById('igual');

botaoCalcular.addEventListener('click', () => {
    const valor1 = parseFloat(num1.value);
    const valor2 = parseFloat(num2.value);
    let res;

    switch (operacao.value) {
        case '+':
            res = valor1 + valor2;
            break;
        case '-':
            res = valor1 - valor2;
            break;
        case '*':
            res = valor1 * valor2;
            break;
        case '/':
            if (valor2 === 0) {
                resultado.textContent = 'Erro: divisão por zero não é permitida.';
                return;
            }
            res = valor1 / valor2;
            break;
    }

    resultado.textContent = `Resultado: ${res}`;
});