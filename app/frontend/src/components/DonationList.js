// src/components/DonationList.js
import React, { useState, useEffect } from 'react';
import api from '../services/api';

function DonationList() {
    const [donations, setDonations] = useState([]);

    useEffect(() => {
        api.get('/admDoacao').then((response) => {
            setDonations(response.data);
        });
    }, []);

    return (
        <div>
            <h2>Doações</h2>
            <ul>
                {donations.map((donation) => (
                    <li key={donation.id}>
                        <h3>{donation.titulo}</h3>
                        <p>{donation.texto}</p>
                        <small>Doador: {donation.nomeDoador}</small>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default DonationList;
