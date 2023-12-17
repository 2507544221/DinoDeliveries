package com.dinodeliveries.service;

import com.dinodeliveries.dto.DishDTO;
import com.dinodeliveries.dto.DishPageQueryDTO;
import com.dinodeliveries.entity.Dish;
import com.dinodeliveries.result.PageResult;
import com.dinodeliveries.vo.DishVO;

import java.util.List;

public interface DishService {


    /**
     * 新增菜品和口味数据
     *
     * @param dishDTO
     */
    public void saveWithFlaver(DishDTO dishDTO);

    /**
     * 菜品分页查询
     *
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     *
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据ID查询菜品和对应的口味
     *
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 修改菜品和口味
     *
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 菜品起售停售
     *
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据分类id查询菜品
     *
     * @param categoryId
     * @return
     */
    List<Dish> list(Long categoryId);


    /**
     * 条件查询菜品和口味
     *
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);

}
