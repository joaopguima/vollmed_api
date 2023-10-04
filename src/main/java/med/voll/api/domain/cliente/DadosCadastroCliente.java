package med.voll.api.domain.cliente;

import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroCliente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
    ) {
}
