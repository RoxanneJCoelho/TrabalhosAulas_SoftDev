    @extends('layouts.fe_master')

    @section('content')

    <h1>Sou a tua HomePage</h1>
    <h5>Olá {{isset($myName) ? $myName : 'Utilizador'}}</h5>
    <p>Olá, aqui podes adicionar utilizadores:</p>
    <ul>
        <li><a href="{{route('hello_route_name')}}">Hello</a></li>
        <li><a href="{{route('users_all')}}">Lista de Users</a></li>

    </ul>
    <img src="{{asset('image/meme.png')}}" alt="gato meme">

    @endsection

