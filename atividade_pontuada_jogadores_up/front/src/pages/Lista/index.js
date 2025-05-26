// src\pages\Lista\index.js

import ListaDeUsuarios from '../../components/ListaDeUsuarios'
import { useNavigate } from 'react-router-dom'
import logo from '../../assets/images/cbf-logo.png'
import './styles.css'

function PaginaListaUsuarios() {
    const navigate = useNavigate()
    
return (
        <div className='pagina-lista-usuarios'>
            <div className='container-lista'>
                <div className='container-esquer'>
                    <img src={logo} alt="Logo" className='logo-cbf'/>
                </div>
                <div className='container-dire'>
                    <h2>Lista de usuários</h2>
                    <ListaDeUsuarios />
                    <button onClick={() => navigate('/')} className='link-voltar-c'>
                        Cadastrar Jogadores
                    </button>
                </div>
            </div>
        </div>
    )
}

export default PaginaListaUsuarios