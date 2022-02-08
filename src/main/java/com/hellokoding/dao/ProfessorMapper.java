package com.hellokoding.dao;

import com.hellokoding.springmvc.MyBatisUtil;
import com.hellokoding.springmvc.Professor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProfessorMapper {

    public void saveProfessor(Professor professor){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession(); //task 1 = c3p0 lib
        session.insert("insertProfessor", professor); //task 2 = xml queries mapper to see mybatis
        session.commit();
        session.close();
    }

    public void updateProfessor (Professor professor){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.update("updateProfessor", professor);
        session.commit();
        session.close();
    }

    public void deleteProfessor(int professorId){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        session.delete("deleteProfessor", professorId);
        session.commit();
        session.close();
    }

    public List<Professor> getAllProfessors(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Professor> professorsList = session.selectList("getAllProfessors");
        session.commit();
        session.close();
        return professorsList;
    }

    public Professor findById(int professorId){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        Professor professor = (Professor) session.selectOne("findById", professorId);
        session.commit();
        session.close();
        return professor;
    }
}