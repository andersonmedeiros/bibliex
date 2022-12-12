/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import model.bean.PostoGraduacao;
import model.dao.PostoGraduacaoDAO;

/**
 *
 * @author STI
 */
public class FacadeAjax {
    
    public ArrayList<PostoGraduacao> getPostosGraduacoesDWR() throws Throwable, Exception{
        ArrayList<PostoGraduacao> pgs = new ArrayList<>();
        pgs = PostoGraduacaoDAO.getPostosGraduacoesDWR();
        return pgs;
    }
    
}
