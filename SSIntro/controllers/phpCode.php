<?php
$helloworld = 'Aqui vamos trabalhar com o servidorr e ligar a web à Base de Dados';

// ex criar uma var
$name = 'Roxanne Coelho';

 //definir uma função em php
    function plus($x, $y){
        return $x + $y;
    }

    function hello($name, $surname){
        return $name. ' '. $surname;
    }
    
    // declarar um array
    // vida real: vai a bd e select users.name from users;
    $students = ['Rui', 'Eliane', 'Pedro'];
    var_dump($students);

    $modules = [
        'OOP' => 'Vitor',
        'Design Patterns' => 'Vitor',
        'WEB' => 'Laís',
        'Sql' => 'Alexandre',
         'Programação Servidor' => 'Alexandre'
    ];
    var_dump($modules);

    //ir ao ficheiro json e buscar dados
    $cesaeData = file_get_contents('./data/courses.json');

    $cesaeData = json_decode($cesaeData, true);

    var_dump($cesaeData);