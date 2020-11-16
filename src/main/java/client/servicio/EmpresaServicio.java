package client.servicio;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import client.modelo.Empresa;
import client.repositorio.empresaRepositorio;
import client.util.Messages;
import client.util.ResponseDTO;
import oracle.jdbc.driver.Message;

@Service

public class EmpresaServicio {
	
	@Autowired
	empresaRepositorio repobd;
	
	
	public ResponseDTO findAll() {
		ResponseDTO res = new ResponseDTO();
		try {
			res.setRespuesta(repobd.findAll());
		} catch (Exception e) {
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return res;
	}
	
	
	public ResponseDTO crear(Empresa empre) {
		
		ResponseDTO res = new ResponseDTO();
		try {
			res.setRespuesta(repobd.save(empre));
		} catch (Exception e) {
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return res;
	}
	
	
	public ResponseDTO actualizar(Empresa empre)
	{
		ResponseDTO res = new ResponseDTO();
		try
		{
			if(repobd.existsById(empre.getIdEmpresa()))
			{
				res.setRespuesta(repobd.save(empre));
				res.setCodigo(Messages.CODE_UPDATE_SUCCES);
				res.setMensaje(Messages.MSG_UPDATE_OK);
			}
			else
			{
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
			}
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return res;	
	}
	


		public ResponseDTO borrar(Long id) {
			ResponseDTO res = new ResponseDTO();
			
			
			try {
				
				if(repobd.findById(id)!=null) {
					repobd.deleteById(id);
					res.setCodigo(Messages.CODE_DELETE_SUCCES);
				}else {
					res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
					res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
				}
				
			} catch (Exception e) {
				res.setCodigo(Messages.CODE_FATAL_ERROR);
				res.setMensaje(Messages.MSG_FATAL_ERROR);
				e.printStackTrace();
			}
			return res;
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


