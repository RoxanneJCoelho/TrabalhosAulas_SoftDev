// ex da pagina 94
function validUserNames(array) {
    return array.filter(function(username) {
        return username.length < 10;
    });
}

// teste do ex
const usernames = ['mark', 'staceysmom1978', 'q29832128238983', 'carrie98', 'MoanaFan'];
const valid = validUserNames(usernames);
console.log(valid); // ['mark', 'carrie98', 'MoanaFan']

// ex da pag 97

const array = [2, 4, 7, 8];
function allEvens(array) {
  return array.every(num => num % 2 === 0);
}
const valid1 = allEvens(array);
console.log(valid1); 
