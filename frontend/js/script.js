const modalReservaLeito = document.getElementById('modal-reserva-leito');
const btnReserve = document.getElementById('btn-reserve');
const closeModal = document.getElementById('close-modal');

// Exibe o modal de reserva de leito ao clicar no botão "Reserve seu leito"
btnReserve.addEventListener('click', () => {
    modalReservaLeito.style.display = 'flex'; // Exibe a tela de reserva de leito
});

// Fecha o modal de reserva de leito ao clicar no botão de fechar
closeModal.addEventListener('click', () => {
    modalReservaLeito.style.display = 'none'; // Esconde o modal de reserva de leito
});

// Fecha o modal de reserva de leito ao clicar fora dele
window.addEventListener('click', (event) => {
    if (event.target === modalReservaLeito) {
        modalReservaLeito.style.display = 'none'; // Esconde o modal ao clicar fora
    }
});

// Formatação automática do CPF
document.getElementById('cpf').addEventListener('input', (event) => {
    let cpf = event.target.value.replace(/\D/g, ''); // Remove todos os caracteres não numéricos
    if (cpf.length > 3) cpf = cpf.slice(0, 3) + '.' + cpf.slice(3);
    if (cpf.length > 7) cpf = cpf.slice(0, 7) + '.' + cpf.slice(7);
    if (cpf.length > 11) cpf = cpf.slice(0, 11) + '-' + cpf.slice(11, 13);
    event.target.value = cpf; // Atualiza o valor no campo de entrada
});

// Exibe ou oculta o campo de plano de saúde
document.getElementById('plano-saude').addEventListener('change', (event) => {
    const detalhesPlanoContainer = document.getElementById('detalhes-plano-container');
    if (event.target.value === 'sim') {
        detalhesPlanoContainer.style.display = 'block';
    } else {
        detalhesPlanoContainer.style.display = 'none';
        document.getElementById('detalhes-plano').value = '';
    }
});
