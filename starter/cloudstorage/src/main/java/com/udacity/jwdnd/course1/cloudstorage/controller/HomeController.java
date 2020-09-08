package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.FileForm; //Need to create FileForm
import com.udacity.jwdnd.course1.cloudstorage.services.FileListService; //Need to create FileListService
import com.udacity.jwdnd.course1.cloudstorage.model.NoteForm; //Need to create NoteForm
import com.udacity.jwdnd.course1.cloudstorage.services.NoteListService; //Need to create NoteListService
import com.udacity.jwdnd.course1.cloudstorage.model.CredForm; //Need to create CredForm
import com.udacity.jwdnd.course1.cloudstorage.services.CredListService; //Need to create CredListService
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

}
