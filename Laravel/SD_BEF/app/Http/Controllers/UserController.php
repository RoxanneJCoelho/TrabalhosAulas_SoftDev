<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{

public function curso() {
    return view('users.curso');
}

public function getUsersArray()
    {
        $users = ['Ana', 'Bruno', 'Cátia', 'Matilde', 'Sara'];

        return view('users.arrayUsers', compact('users'));
    }
}
