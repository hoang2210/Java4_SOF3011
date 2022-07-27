package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.User;
import utils.JpaUtil;

public class UserDAO {
	private EntityManager em;
	
	public UserDAO() {
		this.em = JpaUtil.getEntityManager();
	}
	
	public User create(User entity) throws Exception {
		try {
			//Bắt đầu Transaction
			this.em.getTransaction().begin();
			
			//Thêm mới đối tượng
			this.em.persist(entity);
			
			//Kết thúc Transaction
			this.em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	
	public List<User> all(){
		String jpql = "SELECT obj FROM User obj";
		TypedQuery<User> query = this.em.createQuery(jpql, User.class);
		
		return query.getResultList();
	}
	
	public User findByID(int id) {
		return this.em.find(User.class, id);
	}
	
	public void delete(User entity) throws Exception {
		try {
			//Bắt đầu Transaction
			this.em.getTransaction().begin();
			
			//Xóa đối tượng
			this.em.remove(entity);
			
			//Kết thúc Transaction
			this.em.getTransaction().commit();			
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	
	public void update(User entity) throws Exception {
		try {
			//Bắt đầu Transaction
			this.em.getTransaction().begin();
			
			//Xóa đối tượng
			this.em.merge(entity);
			
			//Kết thúc Transaction
			this.em.getTransaction().commit();			
		} catch (Exception e) {
			e.printStackTrace();
			this.em.getTransaction().rollback();
			throw e;
		}
	}
	
	public User findByEmail(String email) {
		
		String jpql = "SELECT obj FROM User obj"
			+ " WHERE obj.email = :email";
		TypedQuery<User> query = this.em
			.createQuery(jpql, User.class);
		query.setParameter("email", email);
		

		return query.getSingleResult();
	}
}

