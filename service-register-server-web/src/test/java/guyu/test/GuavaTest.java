package guyu.test;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Guava Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>三月 27, 2019</pre>
 */
public class GuavaTest {

    private Logger logger = LoggerFactory.getLogger(GuavaTest.class);
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void optionalTest() {
        logger.info("optionalTest start --------");

        HashMap<String, Object> map = null;
        try {
            Optional.of(map).or(new HashMap<>(3));
        } catch (NullPointerException e) {
            logger.info("guava Optional.of process");
        }
       HashMap<String, Object> optionalMap = Optional.fromNullable(map).or(new HashMap<>(3));
        logger.info(""+Optional.of(optionalMap).isPresent());
        logger.info("optionalTest end --------");
    }
    @Test
    public void convenienceMethodsTest(){
        stringsConvenienceMethodsTest();
    }

    private void stringsConvenienceMethodsTest() {
        logger.info("stringsConvenienceMethodsTest start --------");

        String waitVerify1 = " ";
        String waitVerify2 = null ;
        String waitVerify3 = "天地人和";
        Optional varify1 = Optional.fromNullable(waitVerify1);

        logger.info(waitVerify1+Strings.isNullOrEmpty(waitVerify1));
        logger.info(waitVerify2+Strings.isNullOrEmpty(waitVerify2));
        logger.info(waitVerify3+Strings.isNullOrEmpty(waitVerify3));

        logger.info("stringsConvenienceMethodsTest end --------");

    }

    /**
     * 排序测试
     */
    @Test
    public void orderingTest(){
        ForOrderindTest test1 = new ForOrderindTest(1,2);
        ForOrderindTest test2 = new ForOrderindTest(2,3);
        ForOrderindTest test3 = new ForOrderindTest(2,2);
        List<ForOrderindTest> testList = new ArrayList<>(3);
        testList.add(test1);testList.add(test2);testList.add(test3);
         Ordering ordering =   new Ordering<ForOrderindTest>(){
            public int compare(ForOrderindTest left, ForOrderindTest right) {
                  if(left.order == right.order){
                      return Ints.compare(left.secondOrder,right.secondOrder);
                  }
                return Ints.compare(left.order,right.order);
            }
        }.nullsFirst();
        List<ForOrderindTest> copyList = ordering.sortedCopy(testList);
        for (ForOrderindTest copyTest: copyList) {
              logger.info(copyTest.toString());
        }
        for (ForOrderindTest test: testList) {
            logger.info(test.toString());
        }
    }

    /**
     * 用于orderingTest测试
     */
    private class  ForOrderindTest{
        /**
         * 第一排序比较点
         */
       private  int order;
        /**
         * 第二排序比较点
         */
       private  int secondOrder;


       public  ForOrderindTest(int order,int secondOrder){
            this.order = order;
            this.secondOrder = secondOrder;
       }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getSecondOrder() {
            return secondOrder;
        }

        public void setSecondOrder(int secondOrder) {
            this.secondOrder = secondOrder;
        }

        public String toString(){
           return "order is:"+order +"--secondOrder is"+secondOrder;
        }
    }
} 
