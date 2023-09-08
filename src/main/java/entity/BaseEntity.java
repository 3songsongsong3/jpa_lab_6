package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/**
 * 객체들이 주로 사용하는 공통 매핑 정보 정의
 * 테이블과 매핑할 필요 없고 자식 엔티티에게 공통으로 사용되는 매핑 정보만 제공
 * -> @MappedSuperclass로 지정한 클래스는 엔티티가 아니므로 em.find()나 JPQL에서 사용할 수 없다.
 * 클래스를 직접 생성해서 만드는 일은 거의 없으므로 추상 클래스 권장
 */
@MappedSuperclass
public abstract class BaseEntity {

    @Id @GeneratedValue
    private Long id;
    private String name;
}
