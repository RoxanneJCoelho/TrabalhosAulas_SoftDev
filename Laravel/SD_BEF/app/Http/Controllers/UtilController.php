<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UtilController extends Controller
{
    public function index() {
        $myName = $this -> getUser();
    return view('utils.homepage', compact('myName'));
}
public function sayHello() {
    $myName = $this -> getUser();
    return view('users.hello', compact('myName'));
}
private function getUser(){
    // query á base de dados para buscar o user
    $myName = 'Gatinho do meme';
    return $myName;
}

}
