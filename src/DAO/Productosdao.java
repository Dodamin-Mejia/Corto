/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.istack.internal.logging.Logger;
import conexion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
//import interfaces.metodos;
//import modelo.Filtro;

/**
 *
 * @author LN710Q
 */
public class Productosdao {
    private static final String SQL_INSERT = "INSERT INTO productos(id, nombre, codigo , tipo, cantidad, precio, disponibilidad) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE productos SET nombre = ?, codigo = ?, tipo = ? WHERE cod = ?";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE codProducto = ?";
    private static final String SQL_READ = "SELECT *FROM productos WHERE codProducto = ?";
    private static final String SQL_REDALL = "SELECT *FROM productos";
    
    public static final Conexion con = Conexion.conectar();
    
    @Override
    public boolean create(Productosdao g){
        preparedStatement ps;
        try{
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getNombre());
            ps.setString(2, g.getCodigo());
            ps.setInt(3, g.getCantidad);
            ps.setBoolean(4, true);
            if (ps.executeUpdate() > 0){
                return true;
            }            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(ProductosDao.class.getName()).log(Level1.SEVERE, null, ex);
        } finally{
            con.cerrarConexion();
        }
       return false;
    }
    
    @Override
    public boolean delete(Object key){
        preparedStatement ps;
        try{
            ps = con.getCNX().preparedStatement(SQL_DELETE);
            ps.setString(1, key.toString());
            
            if(ps.executeUpdate() > 0){
                return true;
            }       
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(productosdao.class.getName()).Log(Level.SEVERE, null, ex);    
    }finally{
            con.cerrarConexion();            
        }
        return false;
    }
    @Override
    public producto read(Object key){
        producto p = null;
        preparedStatement ps;
        ResultSet rs;
        
        try{
            ps = con.getCNX().preparedStatement(SQL_READ);
            PS.setString(1, key.toString());
            
            rs = ps.executeQwery();
            
            while(rs.next()){
                p = new productos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5));
            }
            rs.close();
        }catch (SQLException ex){
                System.out.println(ex.getMessage());
                Logger.getLogger(Productosdao.class.getName().log(Level.SEVERE, null, ex));
        }finally{
            con.cerrarConexion();
        }
        return p;        
    }
    @Override
    public ArrayList<productos> readAll(){
        ArrayList<productos> all = new ArrayList();
        Statement s;
        RsultSet rs;
        try{
            s = con.getCnx().preapredStatement(SQL_READALL);
            rs = s.executeQuery(SQL_READALL);
            while(rs.next()){
                all.add(new productos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5)));
        }
            rs.close();
        }catch(SQLException ex){
            Logger.getLogger(productosdao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return all;
    }
}
