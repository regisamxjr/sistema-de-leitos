document.addEventListener('DOMContentLoaded', function() {
    const btnReserve = document.getElementById('btn-reserve');
    const modal = document.getElementById('modal-login');
    const closeModal = document.getElementById('close-modal');

    // Mostrar o modal quando o botão for clicado
    btnReserve.addEventListener('click', function() {
        modal.style.display = 'block';
    });

    // Fechar o modal quando o botão de fechar for clicado
    closeModal.addEventListener('click', function() {
        modal.style.display = 'none';
    });

    // Fechar o modal quando clicar fora da área do modal
    window.addEventListener('click', function(event) {
        if (event.target === modal) {
            modal.style.display = 'none';
        }
    });
});
