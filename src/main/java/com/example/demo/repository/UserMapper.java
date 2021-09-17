package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;


//ユーザー情報 Mapper
@Mapper
public interface UserMapper {
	
	//XMLファイルにSQL文を記述しない場合の記載
	@Select("SELECT * FROM User WHERE id = #{id}")
	
    //ユーザー情報検索
    //@param user 検索用リクエストデータ
    //@return ユーザー情報
    User search(UserSearchRequest user);
    
}