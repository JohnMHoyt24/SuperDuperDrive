package com.udacity.jwdnd.course1.cloudstorage.mapper;
import com.udacity.jwdnd.course1.cloudstorage.model.NoteForm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NotesMapper {
    @Select("SELECT * FROM NOTES WHERE notetitle = #{notetitle}")
    NoteForm getNoteForm(String note);

    @Insert("INSERT INTO NOTES (noteid, notetitle, notedescription, userid) VALUES(#{noteid}, #{notetitle}, #{notedescription}, #{userid})")
    @Options(useGeneratedKeys = true, keyProperty = "noteid")
    int insert(NoteForm user);
}
