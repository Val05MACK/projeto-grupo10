// src/App.js
import React from 'react';
import DonationForm from './components/DonationForm';
import DonationList from './components/DonationList';
import './App.css';

function App() {
    return (
        <div>
            <h1>Portal de Doações</h1>
            <DonationForm />
            <DonationList />
        </div>
    );
}

export default App;
