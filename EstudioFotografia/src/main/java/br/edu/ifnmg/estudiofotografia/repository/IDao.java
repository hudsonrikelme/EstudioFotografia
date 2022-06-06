package br.edu.ifnmg.estudiofotografia.repository;

import java.util.List;

/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public interface IDao<E, K> {
    public K salvar(E e);
    public E localizarPorId(K id);

    public List<E> localizarTodos();

    public Boolean excluir(E ee);
}
