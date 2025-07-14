@extends('layouts.fe_master')

    @section('content')
    <h1>Olá {{$myName}}</h1>
    <p>Adicionar Utilizador: </p>
    <a href="{{route('voltar')}}">Voltar</a>;
     @endsection

