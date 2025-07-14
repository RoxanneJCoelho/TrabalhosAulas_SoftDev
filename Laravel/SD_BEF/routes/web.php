<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UtilController;
use App\Http\Controllers\UserController;

Route::get('/', function () {
    return view('welcome');
});

Route::get('/home', [UtilController::class, 'index']) -> name('voltar');

Route::get('/hello', [UtilController::class, 'sayHello']) ->name('hello_route_name');

Route::get('/arrayUsers', [UserController::class, 'getUsersArray'])->name('users_all');

Route::get('/modules/{name}', function($name){
    return '<h1>Este é o módulo de:'.$name.'</h1>';
});

Route::fallback(function(){
    return "<a href=".route('hello_route_name').">Estás perdido?</a>";
});
