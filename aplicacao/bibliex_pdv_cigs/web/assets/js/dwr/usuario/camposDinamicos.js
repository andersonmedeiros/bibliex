/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function alimentaSelectPostosGraduacoes(postosgraduacoes){
    dwr.util.removeAllOptions("txtPostoGraduacao");
    dwr.util.addOptions("txtPostoGraduacao", [{id: "0", descricao: "Selecione um posto ou graduação..."}], "id", "descricao");
    dwr.util.addOptions("txtPostoGraduacao", postosgraduacoes, "id", "descricao");
}
FacadeAjax.getPostosGraduacoesDWR(alimentaSelectPostosGraduacoes);
