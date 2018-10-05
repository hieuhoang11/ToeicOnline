package vn.hieuhoang.core.service;

/**
 * Created by Hieu Hoang on 27/09/2018.
 */
public interface ListenGuideLineService {
    Object[] findListenGuidelineByProperties(String property , Object value , String sortExpression , String sortDirection , Integer offset , Integer limit);
}
