package com.flyedu.mapper;

import com.flyedu.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 权限 Mapper 接口
 * </p>
 *
 * @author cai fei fei
 * @since 2020-10-21
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

    List<String> selectAllPermissionValue();

    List<String> selectPermissionValueByUserId(String id);

    List<Permission> selectPermissionByUserId(String userId);
}
