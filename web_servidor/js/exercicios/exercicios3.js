const fullNames = [
    {
        first: 'Albus',
        last: 'Dumbledore'
    },

    {
        first: 'Harry',
        last: 'Potter'

    },
    {
        first: 'Hermione',
        last: 'Granger'

    },
    {
        first: 'Ron',
        last: 'Weasley'

    },
    {
        first: 'Rubens',
        last: 'Hagrid'

    },
    {
        first: 'Minerva',
        last: 'McGonagall'

    },
    {
        first: 'Severus',
        last: 'Snape'

    }

]

const firstName = fullNames.map(function (fullNames){
    return fullNames.first;
})

const NomeCompleto = fullNames.forEach(function (fullNames){
   console.log(`${fullNames.first} ${fullNames.last}`) 
   })

const greet = (firstName) => {
    return "hey " + firstName + "!"
}