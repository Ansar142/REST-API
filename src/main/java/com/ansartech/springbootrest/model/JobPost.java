package com.ansartech.springbootrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
        public int postId ;
        public String postDesc;
        public String postProfile;
        public int reqExperience ;
        public List<String> postTechStack;
}
