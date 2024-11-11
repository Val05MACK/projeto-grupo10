// src/components/DonationForm.js
import React, { useState } from 'react';
import api from '../services/api';

function DonationForm() {
    const [nomeDoador, setNomeDoador] = useState('');
    const [titulo, setTitulo] = useState('');
    const [texto, setTexto] = useState('');

    const handleSubmit = async (event) => {
        event.preventDefault();

        try {
            // Requisição POST para adicionar uma nova doação
            const response = await api.post('/admDoacao', {
                nomeDoador,
                titulo,
                texto,
            });
            console.log("Doação adicionada com sucesso:", response.data);

            // Limpar os campos do formulário após a submissão
            setNomeDoador('');
            setTitulo('');
            setTexto('');
        } catch (error) {
            console.error("Erro ao adicionar doação:", error);
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <input
                type="text"
                placeholder="Nome do Doador"
                value={nomeDoador}
                onChange={(e) => setNomeDoador(e.target.value)}
            />
            <input
                type="text"
                placeholder="Título"
                value={titulo}
                onChange={(e) => setTitulo(e.target.value)}
            />
            <textarea
                placeholder="Texto da Doação"
                value={texto}
                onChange={(e) => setTexto(e.target.value)}
            ></textarea>
            <button type="submit">Adicionar Doação</button>
        </form>
    );
}

export default DonationForm;
