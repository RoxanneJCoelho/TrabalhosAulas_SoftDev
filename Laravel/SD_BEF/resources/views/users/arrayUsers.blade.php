@extends('layouts.fe_master')

    @section('content')
    <h1>Lista de Users:</h1>
    <ul>
        @foreach($users as $user)
            <li>{{ $user }}</li>
        @endforeach
    </ul>
    <a href="{{route('voltar')}}">Voltar</a>;
     @endsection
