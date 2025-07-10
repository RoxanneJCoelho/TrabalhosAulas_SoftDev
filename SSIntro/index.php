 <?php 
    include('./controllers/phpCode.php');

    ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="js/script.js" defer></script>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Olá Servidor</h1> 
    <h2>Olá <?= $name ? $name : 'Utilizador' ?></h2>
    <p><?= plus(8, 6) ?></p>

    <p>Olá <?= hello ('Sara', 'Monteiro') ?></p>

    <p>Olá <?= $students [2] ?></p>

    <?php
    foreach($students as $item){
        echo $item .'</br>';
    }
    ?>
    <hr>
    <?php
    foreach($modules as $key=>$value){
        echo $key .'</br>';
    }
    ?>
    <hr>
    <ul>
        <?php
        foreach($modules as $key=>$value){
            echo "<li>$key</li>";
        }
        ?>
    </ul>
     <ul>
        <?php
        foreach($cesaeData['data'] as $data){
            echo "<li>". $data['course']." e o ano é ". $data['year']."</li>";
        }
        ?>
    </ul>

    <?= 
    "<h2>Olá, o meu nome é $name</h2>";

   
    echo "<h4>$helloworld</h4>";

    

    


    

    ?>

</body>
</html>