package kr.cloud.web.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.cloud.web.entity.Devices;
import kr.cloud.web.entity.users;


@Mapper
public interface BoardMapper {

	List<Devices> selectDevicesAll();
	
	@Select("SELECT idx FROM users WHERE user_id = #{user_id} AND password = #{password}")
	public users gologin(users login);

	public int goRegister(users register);
}
