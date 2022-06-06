package br.edu.ifnmg.estudiofotografia.repository;

/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public interface IDao<E, K> {
    public K salvar(E e);
}
