package com.hellokoding.springmvc;
import com.hellokoding.dao.ProfessorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import in.bushansirgur.dao.EmployeeMapper;
//import in.bushansirgur.entity.Employee;


@Controller @RequestMapping("/professor")
public class ProfessorController {



        @Autowired
        ProfessorMapper professorMapper;

        private static final String PROFESSOR = "Professor";
        private static final String PROFESSORLIST = "ListProfessors";

        @RequestMapping("/professorList")
        public String showListOfProfessor(Model model)
        {
            model.addAttribute("professorList", professorMapper.getAllProfessors());
            return PROFESSORLIST;
            //http://localhost:8080/myHeroku/professor/professorList
        }

        @RequestMapping("/showFormForAdd")
        public String addProfessor(Model model){
            model.addAttribute("professor", new Professor());
            return PROFESSOR;
        }

        @RequestMapping("/saveProcess")
        public String saveProfessor(@ModelAttribute("professor") Professor professor){
            if(professor.getId() == null){
                professorMapper.saveProfessor(professor);
                //task 3  = controller - service (transaction он содердит в себе любую логику) - dao - mapper
                // mvc pattern

            }else{
                professorMapper.updateProfessor(professor);
            }

            return "redirect:/professor/listOfProfessor";
        }

        @RequestMapping("/displayUpdateForm")
        public String showUpdateForm(@RequestParam("professorId") int professorId, Model model){
            model.addAttribute("professor", professorMapper.findById(professorId));
            return PROFESSOR;
        }

        @RequestMapping("/displayDeleteForm")
        public String deleteProfessor(@RequestParam("professorId") int professorId){
            professorMapper.deleteProfessor(professorId);
            return "redirect:/professor/listOfProfessor";
        }
    }