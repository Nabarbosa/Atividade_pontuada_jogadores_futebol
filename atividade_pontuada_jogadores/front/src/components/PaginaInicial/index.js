// src\components\PaginaInicial\index.js

import React from "react";
import { useNavigate } from "react-router-dom";
import './styles.css';
import logo from '../../assets/images/cbf-logo.png';

function PaginaInicial() {
    const navigate = useNavigate();

    const handleCadastroClick = () => {
        navigate('/cadastro')
    }

    return (
        <div className="container">
            <div className="container-esquerda">
                <img className="logo-cbf" src={logo} alt="logo" />
            </div>

            <div className="container-direita">
                <h2 className="seja-bem-vindo">-- Seja Bem Vindo! --</h2>
                
                <div className="botoes">
                    <button type="button" onClick={handleCadastroClick} className="butao-cadastro">
                        Página de Cadastro
                    </button>
                    <button type="button" onClick={() => navigate('/usuarios')} className="butao-ver-usuarios">
                        Jogadores Cadastrados
                    </button>
                </div>
            </div>
        </div>
    );
}

export default PaginaInicial;