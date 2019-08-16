/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌瀚为云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.dms.favorite.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.honvay.hdms.dms.document.entity.Document;
import com.honvay.hdms.dms.favorite.dto.RemoveRequest;
import com.honvay.hdms.dms.favorite.entity.Favorite;
import com.honvay.hdms.dms.favorite.mapper.FavoriteMapper;
import com.honvay.hdms.dms.favorite.service.FavoriteService;
import com.honvay.hdms.framework.support.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author LIQIU
 */
@Service
public class FavoriteServiceImpl extends BaseServiceImpl<Favorite, Integer> implements FavoriteService {

	@Autowired
	private FavoriteMapper favoriteMapper;

	@Override
	public void remove(RemoveRequest request) {
		LambdaUpdateWrapper<Favorite> wrapper = Wrappers.lambdaUpdate();
		wrapper.in(Favorite::getDocumentId, request.getDocumentIds())
				.eq(Favorite::getUserId, request.getUserId());
		this.favoriteMapper.delete(wrapper);
	}

	@Override
	public Favorite save(Favorite entity) {
		QueryWrapper<Favorite> wrapper = new QueryWrapper<Favorite>();
//		LambdaQueryWrapper<Favorite> wrapper = Wrappers.lambdaQuery();
		wrapper.in("document_id", entity.getDocumentId());
		wrapper.eq("user_id", entity.getUserId());
		List<Favorite> favorites = this.favoriteMapper.selectList(wrapper);
		if (favorites.isEmpty()) {
			return super.save(entity);
		}
		return favorites.get(0);
	}

	@Override
	public Favorite get(Integer documentId, Integer userId) {
		Assert.notNull(documentId, "参数错误");
		QueryWrapper<Favorite> wrapper = new QueryWrapper<Favorite>();
//		LambdaQueryWrapper<Favorite> wrapper = Wrappers.lambdaQuery();
		
		wrapper.eq("document_id", documentId);
		wrapper.eq("user_id", userId);
		return this.favoriteMapper.selectOne(wrapper);
	}
}
