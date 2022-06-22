package com.dazhi100.student.service.biz;


import com.dazhi100.common.annotation.UpdateClientCache;
import com.dazhi100.student.api.dto.StudentDto;
import com.dazhi100.student.service.acl.GradeRepository;
import com.dazhi100.student.service.acl.StudentRepository;
import com.dazhi100.student.service.dto.StudentLeaveDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: huangjl
 * @date: 2022/4/24
 */
@Service
@Slf4j
public class StudentService {

    private StudentRepository studentRepository;

    private GradeRepository gradeRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, GradeRepository gradeRepository) {
        this.studentRepository = studentRepository;
        this.gradeRepository = gradeRepository;
    }


    public void saveStudent(StudentDto studentDto) {
        studentRepository.saveStudent(studentDto);
    }

    /**
     * key sid cid stuId customize
     * key:资源key
     * sid/cid/stuId 使用_（无需），?(变量，根据pathReg规则获取)
     * customize 使用_（无需），或指定参数名称，如 uid、msgId等，默认使用'?'的处理方式，但是会取keyReg指定的参数
     */
    @UpdateClientCache(keyReg = "student _ _ ? _", argReg = "_ _ _ d _")
    @UpdateClientCache(keyReg = "leave _ _ _ leaveId", argReg = "_ _ _ _ d")
    public String update(Long stuId, Long leaveId) {
        log.info("update studentId: {}, leaveId:{}", stuId, leaveId);
        return "update";
    }

    /**
     * key sid cid stuId customize
     * key:资源key
     * sid/cid/stuId 使用_（无需），?(变量，根据pathReg规则获取)
     * customize 使用_（无需），或指定参数名称，如 uid、msgId等，默认使用'?'的处理方式，但是会取keyReg指定的参数
     */
    @UpdateClientCache(keyReg = "student _ _ ? _", argReg = "studentLeaveDto _ _ s _")
    @UpdateClientCache(keyReg = "leave _ _ _ leaveId", argReg = "studentLeaveDto _ _ _ s")
    public String update(StudentLeaveDto studentLeaveDto) {
        log.info("update studentId: {}, studentName:{}", studentLeaveDto.getStuId(), studentLeaveDto.getStudentName());
        return "update";
    }

    public String get(Long stuId) {
        gradeRepository.get();
        studentRepository.saveStudent(null);
        log.info("get studentId: {}", stuId);
        return "get";
    }
}
